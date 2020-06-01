$('document').ready(function(){

    var adgangskode = document.getElementById("adgangskode")

    var bekræftadgangskode = document.getElementById("bekræftadgangskode");

    function validatePassword(){

        if(adgangskode.value != bekræftadgangskode.value) {
            confirmPassword.setCustomValidity("Passwords Don't Match");
        } else {
            confirmPassword.setCustomValidity('');
        }

    }

    adgangskode.onchange = validatePassword;
    bekræftadgangskode.onkeyup = validatePassword;

});