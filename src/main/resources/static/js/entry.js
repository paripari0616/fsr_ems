'use-strict'
$(()=>{
 		$('#regist').click((e)=>{
 			$("#form").prop("action", $(e.currentTarget).data("url"));
			$("#form").submit();
		});
		
 		$('#login').click((e)=>{
 			$("#form").prop("action", $(e.currentTarget).data("url"));
			$("#form").submit();
		});
});