public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    public String whileLoop() {
        String result = "";
        int counter = 0;
        while (counter < personArray.length)
        {
          //  Person currentPerson =  personArray[counter];
          //  currentPerson.toString();
result += result + personArray[counter];
counter++;
        // create a `counter`
        // while `counter` is less than length of array
        // begin loop

        // use `counter` to identify the `current Person` in the array
        // get `string Representation` of `currentPerson`
        // append `stringRepresentation` to `result` variable

        // end loop


        }
        return result;
    }



    public String forLoop() {
        String result = "";
        // identify initial value
        int i= 0;
        // identify terminal condition
      // condition = personArray.length;
        // identify increment
        i++;
        // use the above clauses to declare for-loop signature
        for(i = 0; i< personArray.length; i++) {
            // begin loop
           // Person cureentPerson = personArray[i];
            // use `counter` to identify the `current Person` in the array
           // cureentPerson.toString();
            result += personArray[i];
            // get `string Representation` of `currentPerson`
            // append `stringRepresentation` to `result` variable
            // end loop
        }
        return result;
    }



    public String forEachLoop() {
        String result = "";
        for (Person currentPerson : personArray){
         // currentPerson.toString();
            result += currentPerson;
        }
        // identify array's type
        // identify array's variable-name
        // use the above discoveries to declare for-each-loop signature
        // begin loop
        // get `string Representation` of `currentPerson`
        // append `stringRepresentation` to `result` variable
        // end loop

        return result;
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}

