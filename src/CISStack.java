import java.util.Arrays;

public class CISStack {
  // Array property.
  private Object[] array;

  // Size property.
  private int size = 0;

  // Pointer property
  private int pointer = -1;

  // Constructor.
  public CISStack(int size) {
    array = new Object[size];
  }

  // Push. This method pushes a value onto the top of the stack.
  public void push(Object element) {
    pointer++;
    if (pointer == array.length) {
      Object[] temp = array;
      array = Arrays.copyOf(temp, temp.length + 1);
    }
    size++;
    array[pointer] = element;
  }

  // Pop. This method pops a value from the top of the stack.
  public Object pop() {
    if (isEmpty()) return null;
    size--;
    return array[pointer--];
  }

  // isEmpty. Returns a boolean indicating whether the linked list is empty.
  public boolean isEmpty() {
    return size == 0;
  }

  // size. Returns the size of the queue.
  public int size() {
    return size;
  }

  // toString. Returns a description of the queue in, for example, the following format:
  // CISStack{stack=[7, 11], size=2, pointer=1}
  @Override
  public String toString() {
    String result = "CISStack{stack=[";

    for (int i = 0; i < array.length; i++) {
      result += array[i] + (i == array.length - 1 ? "" : ", ");
    }

    result += "], size=" + size + ", pointer=" + pointer + "}";
    return result;
  }
}
