/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package example;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Kamurai
 */
@ManagedBean(name="TableBean")
@RequestScoped
public class TableBean {

private perInfo[] perInfoAll = new perInfo[]{
new perInfo(101, "CHANDAN", "9891444444", "aaa", 11111),
new perInfo(102, "RAVI", "9911666666", "bbb" ,22222),
new perInfo(103, "JOHN", "9313888888", "ccc", 33333),
new perInfo(104, "ANDREW", "9911222222", "ddd" , 44444),
new perInfo(105, "SYMONDS", "9313999999", "eee", 55555),
};

public perInfo[] getperInfoAll() {
return perInfoAll;
}

public class perInfo {
int id;
String name;
String phone;
String city;
int pin;

public perInfo(int id, String name, String phone, String city, int pin) {
this.id = id;
this.name = name;
this.phone = phone;
this.city = city;
this.pin= pin;
}

public int getid() {
return id;
}

public String getname() {
return name;
}

public String getphone() {
return phone;
}

public String getcity() {
return city;
}

public int getpin() {
return pin;
}

}

}
