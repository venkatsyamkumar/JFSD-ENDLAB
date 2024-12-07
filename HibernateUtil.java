public class HibernateUtil {
    private static final SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
    public static SessionFactory getSessionFactory() { return sessionFactory; }
}
