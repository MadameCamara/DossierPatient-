<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="css/app.css">
<link rel="stylesheet" href="css/AjoutPatient.css">

<title> Ajouter patient</title>
</head>
<body>
	<h1> fiche ajout patient</h1>
	 <div class="font-sans text-gray-900 antialiased">
            <div class="min-h-screen flex flex-col sm:justify-center items-center pt-6 sm:pt-0 bg-gray-100">
    <div>
        <a href="http://patientfolder.test/">
            <img class="brand-mobile" src="https://theme.visualmodo.com/medical/wp-content/uploads/sites/37/2017/07/medical-logo-default.png">
            </a>
    </div>
	 <div class="w-full sm:max-w-md mt-6 px-6 py-4 bg-white shadow-md overflow-hidden sm:rounded-lg centre">
	<form action="<%= request.getContextPath() %>/register" method="post">
	
	<div>
                <label class="block font-medium text-sm text-gray-700" for="nom">Nom</label>

                <input class="rounded-md shadow-sm border-gray-300 focus:border-indigo-300 focus:ring focus:ring-indigo-200 focus:ring-opacity-50 block mt-1 w-full" id="email" type="text" name="nom" required="required" autofocus="autofocus">
            </div>

            <div class="mt-4">
                <label class="block font-medium text-sm text-gray-700" for="password">Prenom</label>

                <input class="rounded-md shadow-sm border-gray-300 focus:border-indigo-300 focus:ring focus:ring-indigo-200 focus:ring-opacity-50 block mt-1 w-full" id="password" type="text" name="prenom" required="required">
            </div>

            
            <div class="mt-4">
                <label class="block font-medium text-sm text-gray-700" for="password_confirmation">Adresse</label>

                <input class="rounded-md shadow-sm border-gray-300 focus:border-indigo-300 focus:ring focus:ring-indigo-200 focus:ring-opacity-50 block mt-1 w-full" id="password_confirmation" type="text" name="adresse" required="required">
            </div>
            <div>
                <label class="block font-medium text-sm text-gray-700" for="nom">Sexe</label>

                <input class="rounded-md shadow-sm border-gray-300 focus:border-indigo-300 focus:ring focus:ring-indigo-200 focus:ring-opacity-50 block mt-1 w-full" id="email" type="text" name="sexe" required="required" autofocus="autofocus">
            </div>

            <div class="mt-4">
                <label class="block font-medium text-sm text-gray-700" for="password">Etat matrimonial</label>

                <input class="rounded-md shadow-sm border-gray-300 focus:border-indigo-300 focus:ring focus:ring-indigo-200 focus:ring-opacity-50 block mt-1 w-full" id="password" type="text" name="etatmatrimonial" required="required">
            </div>

            
            <div class="mt-4">
                <label class="block font-medium text-sm text-gray-700" for="password_confirmation">Profession</label>

                <input class="rounded-md shadow-sm border-gray-300 focus:border-indigo-300 focus:ring focus:ring-indigo-200 focus:ring-opacity-50 block mt-1 w-full" id="password_confirmation" type="text" name="profession" required="required">
            </div>
   <div class="mt-4">
   <input type="submit" value="Ajouter" class="inline-flex items-center px-4 py-2 bg-gray-800 border border-transparent rounded-md font-semibold text-xs text-white uppercase tracking-widest hover:bg-gray-700 active:bg-gray-900 focus:outline-none focus:border-gray-900 focus:ring ring-gray-300 disabled:opacity-25 transition ease-in-out duration-150" />
   </div>
   </form>
  </div>
  </div>
 
</body>
</html>