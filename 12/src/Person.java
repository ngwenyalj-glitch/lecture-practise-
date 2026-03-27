public class Person {
    int yearofbirth;

    public Person(int yearofbirth) throws PersonYearofBirthException {

        if (yearofbirth > 2026) {
            throw new PersonYearofBirthException("This person does not exist ");

        }

        this.yearofbirth = yearofbirth;
    }

    @Override
   public String toString (){

   return "year of birth "+ yearofbirth; }
}


