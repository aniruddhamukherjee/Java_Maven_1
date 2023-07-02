package vaccine;

public class Person {

    private String personName;
    private int personAge;
    private long personAaadhaarNumber;



    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public int getPersonAge() {
        return personAge;
    }

    public void setPersonAge(int personAge) {
        this.personAge = personAge;
    }

    public long getPersonAaadhaarNumber() {
        return personAaadhaarNumber;
    }

    public void setPersonAaadhaarNumber(long personAaadhaarNumber) {
        this.personAaadhaarNumber = personAaadhaarNumber;
    }

    public boolean aadhaarValid() {

        int count = 0;
        while (this.personAaadhaarNumber > 0) {
            this.personAaadhaarNumber = this.personAaadhaarNumber / 10;
            count = count + 1;
        }
        if (count != 12)
            return false;
        else
            return true;

    }
}
