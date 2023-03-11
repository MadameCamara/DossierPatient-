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
<form action="DoctorServlet" method="post">
    <h1 align="center">Edit Doctor</h1>
    <div class="w-full sm:max-w-md mt-6 px-6 py-4 bg-white shadow-md overflow-hidden sm:rounded-lg centre">
    <h1>
      <a href="medecin.jsp">List Doctors</a>
    </h1>
    
    <div>
                <label class="block font-medium text-sm text-gray-700" for="nom">CodeDoctor</label>

                <input class="rounded-md shadow-sm border-gray-300 focus:border-indigo-300 focus:ring focus:ring-indigo-200 focus:ring-opacity-50 block mt-1 w-full" id="email" type="text" name="codeDoctor" required="required" autofocus="autofocus">
            </div>
    <div>
                <label class="block font-medium text-sm text-gray-700" for="nom">Nom</label>

                <input class="rounded-md shadow-sm border-gray-300 focus:border-indigo-300 focus:ring focus:ring-indigo-200 focus:ring-opacity-50 block mt-1 w-full" id="email" type="text" name="nom" required="required" autofocus="autofocus">
            </div>

            <div class="mt-4">
                <label class="block font-medium text-sm text-gray-700" for="password">Prenom</label>

                <input class="rounded-md shadow-sm border-gray-300 focus:border-indigo-300 focus:ring focus:ring-indigo-200 focus:ring-opacity-50 block mt-1 w-full" id="password" type="text" name="prenom" required="required">
            </div>

            
            <div class="mt-4">
                <label class="block font-medium text-sm text-gray-700" for="password_confirmation">Specialite</label>

                <input class="rounded-md shadow-sm border-gray-300 focus:border-indigo-300 focus:ring focus:ring-indigo-200 focus:ring-opacity-50 block mt-1 w-full" id="password_confirmation" type="text" name="specialite" required="required">
            </div>
            <div>
                <label class="block font-medium text-sm text-gray-700" for="nom">Nom de l'hopital</label>

                <input class="rounded-md shadow-sm border-gray-300 focus:border-indigo-300 focus:ring focus:ring-indigo-200 focus:ring-opacity-50 block mt-1 w-full" id="email" type="text" name="nomhopital" required="required" autofocus="autofocus">
            </div>

            <div class="mt-4">
                <label class="block font-medium text-sm text-gray-700" for="password">Ville</label>

                <input class="rounded-md shadow-sm border-gray-300 focus:border-indigo-300 focus:ring focus:ring-indigo-200 focus:ring-opacity-50 block mt-1 w-full" id="password" type="text" name="ville" required="required">
            </div>

            
   <div class="mt-4">
   <input type="submit" value="Edit" class="inline-flex items-center px-4 py-2 bg-gray-800 border border-transparent rounded-md font-semibold text-xs text-white uppercase tracking-widest hover:bg-gray-700 active:bg-gray-900 focus:outline-none focus:border-gray-900 focus:ring ring-gray-300 disabled:opacity-25 transition ease-in-out duration-150" name="Edit" />
   </div>
 </form> 
 </div> 
</body>
</html>