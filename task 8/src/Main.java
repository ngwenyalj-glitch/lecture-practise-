//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


import java.util.Scanner;
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.


    Scanner scanner = new Scanner (System.in);
    IO.println("provide index number ");
    int index = Integer.parseInt(scanner.nextLine());

    int[]numbers = {1,2,3,0,5};
    try {
        int element = numbers[index];
        IO.println(10/element);


    }catch (ArithmeticException e){
        IO.println("E1 "+ e.getMessage());
    }catch (IndexOutOfBoundsException e){
        IO.println("E2"+e.getMessage());
    }


}
