//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    IO.println(String.format("Hello and welcome!"));


    int a = 10;
    int b = 0;
    try {
        IO.println(a / b);

    } catch (IndexOutOfBoundsException e) {

    }
    IO.println("hello");// the exception type is wrong

}