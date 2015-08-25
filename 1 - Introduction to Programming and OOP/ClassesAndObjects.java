class Person {

  //These are the data members for the Person class
  String name;
  int age;
  String nationality;

  //These are the functions in the Person class
  void setName(String name1) {
    name = name1;
  }

  void setAge(int age1) {
    age = age1;
  }

  void setNationality(String nationality1)  {
    nationality = nationality1;
  }

  void getName() {
    return name;
  }

  void getAge() {
    return age;
  }

  void getNationality() {
    return nationality;
  }

  //This is the main function, this is where execution of the program begins and ends

  public static void main(String args[]) {
    //Creating an object
    Person mark = new Person();
  }
}
