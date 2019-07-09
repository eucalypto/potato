import java.util.*;
// import java.sql.*;
// We can make both imports without compiler error even though they both define a Date class! Only, if such a class is actually used, the compiler complains.

public class Imports {
    private Date date1 = new Date();
    // The previous line does not compile if you import both statements above! But the compiler complains here and not already during import.

    private java.util.Date date2 = new java.util.Date();
    // private java.sql.Date date3 = new java.sql.Date(2019, 7, 9);
}
