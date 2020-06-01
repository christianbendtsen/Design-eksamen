
$('document').ready(function() {

    $('.table .btn-primary').on('click',function(event){
        event.preventDefault();
        var href= $(this).attr('href');
        $.get(href, function(kunde, status){
            $('#txtAdresseEdit').val(kunde.adresse);
            $('#txtByEdit').val(kunde.by);
            $('#txtDetaljerEdit').val(kunde.detaljer);
            $('#txtEmailEdit').val(kunde.email);
            $('#txtIdEdit').val(kunde.id);
            $('#txtMobilEdit').val(kunde.mobil);
            $('#txtNavnEdit').val(kunde.navn);
            $('#txtTlfEdit').val(kunde.tlf);
            $('#txtHjemmesideEdit').val(kunde.hjemmeside);
        });
        $('#editModal').modal();
    });





    $('.table #deleteButton').on('click',function(event) {
        event.preventDefault();
        var href = $(this).attr('href');
        $('#confirmDeleteButton').attr('href', href);
        $('#deleteModal').modal();
    });
});

