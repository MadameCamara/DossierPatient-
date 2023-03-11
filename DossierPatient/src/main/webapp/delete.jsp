<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="css/app.css">

</head>
<body>
<div class="font-sans text-gray-900 antialiased">
            <div class="min-h-screen flex flex-col sm:justify-center items-center pt-6 sm:pt-0 bg-gray-100">
 <h1>Delete Doctor</h1>
  <h1>
    <a href="medecin.jsp">List Doctors</a>
  </h1>
   
    <div>
        <a href="http://patientfolder.test/">
            <img class="brand-mobile" src="https://theme.visualmodo.com/medical/wp-content/uploads/sites/37/2017/07/medical-logo-default.png">
            </a>
    </div>
   
    <div class="w-full sm:max-w-md mt-6 px-6 py-4 bg-white shadow-md overflow-hidden sm:rounded-lg centre">
  <form action="DoctorServlet" method="post">
   <div class="mt-4">
                <label class="block font-medium text-sm text-gray-700" for="password">entrer le code du docteur</label>

                <input class="rounded-md shadow-sm border-gray-300 focus:border-indigo-300 focus:ring focus:ring-indigo-200 focus:ring-opacity-50 block mt-1 w-full" id="password" type="text" name="codeDoctorS" required="required">
            </div>

            
   <div class="mt-4">
   <input type="submit" value="Delete "  name="Delete"class="inline-flex items-center px-4 py-2 bg-gray-800 border border-transparent rounded-md font-semibold text-xs text-white uppercase tracking-widest hover:bg-gray-700 active:bg-gray-900 focus:outline-none focus:border-gray-900 focus:ring ring-gray-300 disabled:opacity-25 transition ease-in-out duration-150" />
   </div>
  </form>
  </div>
  </div>
  </div>
</body>
</html>