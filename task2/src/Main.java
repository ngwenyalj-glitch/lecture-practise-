//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.



    int[]numbers ={33,4,62,67,89,10};

   try{

    for (int i=0;i<=numbers.length;i++){
        IO.println(numbers [i]);

    } } catch (Exception e) {
       IO.println(e.getMessage()); // 4 out of bounds for length 4
   }IO.println();














}
