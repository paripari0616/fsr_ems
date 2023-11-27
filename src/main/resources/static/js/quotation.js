$(document).ready(function() {
    $.ajax({
        url: 'http://localhost:8081/ems/quotation/getCompany?name=0000000001',
        type: 'GET',
        success: function(data) {
            console.log('data:',data);
        },
        error: function(error) {
            console.log('Error:', error);
        }
    });
});