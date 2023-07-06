'use-strict'
const getCode = (url) =>{
	$.ajax({
		url: url,
		type: "GET",
		dataType: "json",
		success: function(data) {
			const base64Image = data.image;
			$("#code").prop("src", `data:image/png;base64,${base64Image}`);
		}
	});	
};

$(()=>{
	// 初期表示
	getCode($("#codeUrl").data("url") );
	// イメージを押下する時
	$("#code").on("click", function(e) {
		getCode($(e.currentTarget).next().data("url"));
	});
	
	$('#confirm').click((e)=>{
		$("#form").prop("action", $(e.currentTarget).data("url"));
		$("#form").submit();
	});
});