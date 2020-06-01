
$('document').ready(function() {

    $('.table .btn-primary').on('click',function(event){
        event.preventDefault();
        var href= $(this).attr('href');
        $.get(href, function(ansat, status){
            $('#txtIdEdit').val(ansat.id);
            $('#ddlTitleEdit').val(ansat.title);
            $('#txtIntialerEdit').val(ansat.intialer);
            $('#txtSSNEdit').val(ansat.socialSecurityNumber);
            $('#txtFornavnEdit').val(ansat.fornavn);
            $('#txtEfternavnEdit').val(ansat.efternavn);
            $('#ddlKoenEdit').val(ansat.koen);
            $('#txtAdresseEdit').val(ansat.adresse);
            var dob = ansat.dateOfBirth.substr(0,10);

            $('#txtDateOfBirthEdit').val(dob);
            var anseattelsesDato = ansat.ansaettelsesDato.substr(0,10);

            $('#txtAnsaettelsesDatoEdit').val(anseattelsesDato);
            $('#txtByEdit').val(ansat.by);
            $('#txtTlfEdit').val(ansat.tlf);
            $('#txtMobilEdit').val(ansat.mobil);
            $('#ddlMaritalStatusEdit').val(ansat.maritalStatus);
            $('#txtEmailEdit').val(ansat.email);


        });
        $('#editModal').modal();
    });



    $('.table #deleteButton').on('click',function(event) {
        event.preventDefault();
        var href = $(this).attr('href');
        $('#confirmDelete').attr('href', href);
        $('#deleteModal').modal();
    });
});

