import java.sql.*;

class Databasedemo 
{
	public static void main(String[] args) 
	{
try
{
String Uname = args[0];
String Pwd = args[1]; 

Class.forName("oracle.jdbc.driver.OracleDriver");
Connection cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","MAHI1","resh");
PreparedStatement st = cn.prepareStatement("create table newtable(uname varchar2(10),pwd varchar2(10))");
PreparedStatement st1= cn.prepareStatement("insert into newtable values(?,?)");
st1.setString(1, Uname);
st1.setString(2, Pwd);
st.executeUpdate();
st1.executeUpdate();
System.out.println("Data is Successfully Added to OracleDatabase");
}
catch(Exception e)
{
e.printStackTrace();
}

}
}
