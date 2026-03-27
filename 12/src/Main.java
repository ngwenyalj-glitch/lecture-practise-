//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

try {

    Person p2 = new Person(2018);
    Person p3 = new Person(2012);
    Person p1 = new Person(2050);
    Person [] people={p1,p2,p3};
    IO.println(people[0]);
} catch (PersonYearofBirthException e) {
    IO.println( "E1"+e.getMessage());
}catch (IndexOutOfBoundsException e){
    IO.println("E2"+e.getMessage());
}


    try {
        Person p4 = new Person(2018);
        Person p5 = new Person(2012);
        Person p6 = new Person(2010);
        Person [] people1={p4,p5,p6};
        IO.println(people1[3]);

    }catch (IndexOutOfBoundsException e){
        IO.println("E3"+e.getMessage());

    }catch (Exception e){
        IO.println("E4"+e.getMessage());
    }
}




