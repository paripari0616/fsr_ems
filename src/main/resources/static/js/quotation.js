$(document).ready(function() {
    // 会社情報更新
    $('#companySelect').on('change', function() {
        $.ajax({
            url: '/ems/quotation/getCompany',
            type: 'GET',
            data: {
                name: $('#companySelect').val(),
            },
            success: function(data) {
                $('#postCode').html(data.postCode);
                $('#address1').html(data.address1);
                $('#address2').html(data.address2);
                $('#tel').html(data.tel);
                $('#fax').html(data.fax);
            },
            error: function(error) {
                console.log('エラー発生:', error);
            }
        });
    });
});
