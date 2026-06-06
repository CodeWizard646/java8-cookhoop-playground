package coreJavaQandA.equalAndHashCode;

import java.util.Objects;

public class Employee {

    int id;
    String name;



    // now we are overriding object class
    // equals method for our custom
    @Override
    public boolean equals(Object object) {
          Employee e = (Employee) object;
          if(e.id == this.id && e.name.equals(this.name)){
              return true;
          }else {
              return false;
          }
    }




    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
