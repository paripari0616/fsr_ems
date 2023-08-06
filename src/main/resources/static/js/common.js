'use-strict'
$(()=>{
	const nowDate = () => {
		const dateTime = new Date();
		const options = { year: 'numeric', month: 'long', day: 'numeric' };
		const dt =dateTime.toLocaleDateString(undefined, options);
		$("#nowDate").text(dt);
	}
	nowDate();
	
	$(document).on("click", "#back", (e)=>{
		let triggerId = e.target.id;
		if(triggerId !== undefined){
			$("#form").prop("action", $(e.currentTarget).data("url"));
			$("#form").submit();
		}
	});

    // 二重送信処理
});