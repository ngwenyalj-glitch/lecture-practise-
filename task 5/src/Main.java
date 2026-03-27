//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    IO.println(String.format("Hello and welcome!"));

    double[] arr = {4.6, 5.7, 10.6};

    try {


        for (int b = 0; b < arr.length; b++) {

        }
    } catch (IndexOutOfBoundsException e) {
        IO.println(e.getMessage());
    }IO.println(arr.length);
}

