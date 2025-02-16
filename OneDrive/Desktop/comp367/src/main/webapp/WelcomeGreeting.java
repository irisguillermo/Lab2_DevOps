package com.lab2devops.comp367


public class WelcomeGreeting extends HttpServlet{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = "Iris"; // Replace with your name
        
        // Get current time
        int hour = java.time.LocalTime.now().getHour();
        
        String greeting = (hour < 12) 
            ? "Good morning, " + name + ", Welcome to COMP367"
            : "Good afternoon, " + name + ", Welcome to COMP367";
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body><h1>" + greeting + "</h1></body></html>");
    }
}
