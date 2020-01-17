package com.mkutluer;

import org.hibernate.Session;
import com.mkutluer.util.HibernateUtil;

public class Application {
    public static void main(String[] args) {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            HibernateUtil.getSessionFactory().close();
        }
    }

}
