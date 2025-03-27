package gr.aueb.cf.schoolapp;

import java.awt.EventQueue;

public class Main {
	private static final  LandingPage LandingPage = new LandingPage();
	private static final LoginPage LoginPage = new LoginPage();
	private static final Dashboard dashboard = new Dashboard();
	private static final ViewTeachersPage viewTeachersPage = new ViewTeachersPage();
	private static final TeacherView teacherView = new TeacherView();
	private static final  UpdateTeacherPage updateTeacherPage = new UpdateTeacherPage();
	private static final InsertTeacherPage insertTeacherPage = new InsertTeacherPage();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					LandingPage.setVisible(true);
					LandingPage.setLocationRelativeTo(null);
					
					LoginPage.setVisible(false);
					LoginPage.setLocationRelativeTo(null);
					
					dashboard.setVisible(false);
					dashboard.setLocationRelativeTo(null);
					
					viewTeachersPage.setVisible(false);
					viewTeachersPage.setLocationRelativeTo(null);
					
					teacherView.setVisible(false);
					teacherView.setLocationRelativeTo(null);
					
					updateTeacherPage.setVisible(false);
					updateTeacherPage.setLocationRelativeTo(null);
					
					insertTeacherPage.setVisible(false);
					insertTeacherPage.setLocationRelativeTo(null);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public static LandingPage getLandingpage() {
		return LandingPage;
	}

	public static LoginPage getLoginpage() {
		return LoginPage;
	}

	public static Dashboard getDashboard() {
		return dashboard;
	}

	public static ViewTeachersPage getViewTeachersPage() {
		return viewTeachersPage;
	}

	public static TeacherView getTeacherView() {
		return teacherView;
	}

	public static UpdateTeacherPage getUpdateTeacherPage() {
		return updateTeacherPage;
	}

	public static InsertTeacherPage getInsertTeacherPage() {
		return insertTeacherPage;
	}
	
	
}
