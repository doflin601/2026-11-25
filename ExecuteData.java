package pto2.sec04;

public class ExecuteData {
    public static void dbWork(DataAccessObject dao) {
        dao.select();
        dao.insert();
        dao.update();
        dao.update();
    }
    static void main(String[] args) {
        dbWork(new OracleDao());
        System.out.println("----------------------------");
        dbWork(new MySQLDao());
    }
}
