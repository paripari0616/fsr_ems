'use-strict'
$(()=>{
 		$('a[name="delete"]').click((e)=>{
			$("#row").val($(e.currentTarget).data("index"));
 			$("#form").prop("action", $(e.currentTarget).data("url"));
			$("#form").submit();
		});
		
		 $('a[name="modify"]').click((e)=>{
			$("#row").val($(e.currentTarget).data("index"));
 			$("#form").prop("action", $(e.currentTarget).data("url"));
			$("#form").submit();
		});
});