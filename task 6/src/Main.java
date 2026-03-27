//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    IO.println(String.format("Hello and welcome!"));


    int a= 12;
    int b=4;

   try {
       while (b >= 0) {

           IO.println(a / b);
           b--;
       } }catch(Exception e){
           IO.println(e.getMessage());

       } IO.println("hello");




// when you use double you get
}/*Hello and welcome!
        3.0
        4.0
        6.0
        12.0
Infinity
        hello
*/