//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    IO.println(String.format("Hello and welcome!"));

    int[]arr ={3,4,0,4,5,6};
    int i =0;
    try {

        while(i< arr.length){
            IO.println(i/arr[i]);
            i++;
        }


    }catch (IndexOutOfBoundsException e){
     IO.println("E 1"+  e.getMessage());
    }catch (ArithmeticException e){

        IO.println("E2 "+ e.getMessage());
    }



}
