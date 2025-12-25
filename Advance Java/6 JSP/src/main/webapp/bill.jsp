<!-- Example of scripting elements -->

<%
	int q1 = Integer.parseInt(request.getParameter("q1"));
	int p1 = Integer.parseInt(request.getParameter("p1"));
	int q2 = Integer.parseInt(request.getParameter("q2"));
	int p2 = Integer.parseInt(request.getParameter("p2"));
	double gst = Double.parseDouble(request.getParameter("gst"));
%>

<%! 
	double calculateSum(int q1,int p1,int q2,int p2,double gst){
		return (q1*p1+q2*p2) + (q1*p1+q2*p2)*gst/100;
	}
%>

<%
	out.print("Total sum : "+calculateSum(q1, p1, q2, p2, gst));
%>
<br>
<%= "Total Sum : "+calculateSum(q1, p1, q2, p2, gst) %>