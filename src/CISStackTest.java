import static org.junit.jupiter.api.Assertions.*;

class CISStackTest {
  private CISStack cisStack;

  @org.junit.jupiter.api.BeforeEach
  void setUp() {
    cisStack = new CISStack(10);
  }

  @org.junit.jupiter.api.AfterEach
  void tearDown() {
    cisStack = null;
  }

  @org.junit.jupiter.api.Test
  void push() {
    assertEquals(0, cisStack.size());
    cisStack.push(8);
    assertEquals(1, cisStack.size());
    cisStack.push(10);
    assertEquals(2, cisStack.size());
    cisStack.push(12);
    assertEquals(3, cisStack.size());
  }

  @org.junit.jupiter.api.Test
  void pop() {
    assertEquals(0, cisStack.size());
    cisStack.push(8);
    assertEquals(1, cisStack.size());
    cisStack.push(10);
    assertEquals(2, cisStack.size());
    cisStack.push(12);
    assertEquals(3, cisStack.size());

    assertEquals(12, cisStack.pop());
    assertEquals(10, cisStack.pop());
    assertEquals(8, cisStack.pop());
  }

  @org.junit.jupiter.api.Test
  void isEmpty() {
    assertTrue(cisStack.isEmpty());
    assertEquals(0, cisStack.size());
    cisStack.push(8);
    assertFalse(cisStack.isEmpty());
    assertEquals(1, cisStack.size());
    cisStack.push(10);
    assertFalse(cisStack.isEmpty());
    assertEquals(2, cisStack.size());
    cisStack.push(12);
    assertFalse(cisStack.isEmpty());
    assertEquals(3, cisStack.size());

    assertEquals(12, cisStack.pop());
    assertFalse(cisStack.isEmpty());
    assertEquals(10, cisStack.pop());
    assertFalse(cisStack.isEmpty());
    assertEquals(8, cisStack.pop());
    assertTrue(cisStack.isEmpty());
  }

  @org.junit.jupiter.api.Test
  void testToString() {
    String expected = "CISStack{stack=[null, null, null, null, null, null, null, null, null, null], size=0, pointer=-1}";
    assertEquals(expected, cisStack.toString());

    cisStack.push(8);
    cisStack.push(10);
    cisStack.push(12);

    expected = "CISStack{stack=[8, 10, 12, null, null, null, null, null, null, null], size=3, pointer=2}";
    assertEquals(expected, cisStack.toString());
  }
}