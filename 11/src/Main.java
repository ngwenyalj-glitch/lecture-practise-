//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.


    try {
        IO.println(10/0);
    }catch (IndexOutOfBoundsException e){

        IO.println(e.getMessage());

    }finally {
        IO.println("FINALLY");
    }IO.println("sth");
}//exception not handled 
