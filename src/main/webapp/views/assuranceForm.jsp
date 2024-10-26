<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Formulaire d'Assurance</title>
</head>
<body>
<h1> Ajouter une Assurance</h1>

<form action="${pageContext.request.contextPath}/assurance/sante" method="post">
  <h2>Assurance Sante</h2>
  <label>Age:</label>
  <input type="number" name="age" required/><br>

  <label>Antecedents Medicaux:</label>
  <input type="checkbox" name="antecedentsMedicaux"/><br>

  <label>Type de Couverture:</label>
  <select name="typeCouverture">
    <option value="de base">De base</option>
    <option value="premium">Premium</option>
  </select><br>

  <input type="submit" value="Ajouter Assurance Sante"/>
</form>

<form action="${pageContext.request.contextPath}/assurance/habitation" method="post">
  <h2>Assurance Habitation</h2>
  <label>Valeur du Bien:</label>
  <input type="number" name="valeurBien" required/><br>

  <label>Type de Logement:</label>
  <input type="text" name="typeLogement" required/><br>

  <label>Zone a Risque:</label>
  <input type="checkbox" name="zoneRisque"/><br>

  <label>Systeme de Securité:</label>
  <input type="checkbox" name="systemeSecurite"/><br>

  <input type="submit" value="Ajouter Assurance Habitation"/>
</form>

<form action="${pageContext.request.contextPath}/assurance/automobile" method="post">
  <h2>Assurance Automobile</h2>
  <label >Age du Conducteur:</label>
  <input type="number" name="ageConducteur" required/><br>

  <label >Type de Vehicule:</label>
  <input type="text" name="typeVehicule" required/><br>

  <label>Utilisation:</label>
  <select name="utilisation">
    <option value="privee">Privée</option>
    <option value="professionnelle">Professionnelle</option>
  </select><br>

  <label>Historique de Conduite Sans Sinistre:</label>
  <input type="checkbox" name="historiqueConduiteSansSinistre"/><br>

  <input type="submit" value="Ajouter Assurance Automobile"/>
</form>
</body>
</html>
