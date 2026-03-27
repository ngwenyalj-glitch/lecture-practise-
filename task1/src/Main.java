//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    int[] numbers = {1, 2, 3, 4};
    try {
        numbers[4] = 5;//the exception is thrown
        numbers [3]=10;
                IO.println("we made a change ");

 } catch (Exception e) {
        IO.println(e.getMessage()); //Index 4 out of bounds for length 4
        }
    IO.println("something");



}
