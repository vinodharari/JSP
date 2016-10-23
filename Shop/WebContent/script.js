
		var username = "";
		function send_message(message){
			var prevState = $("#container").html();
			if(prevState.length > 3){
				prevState = prevState + "<br>";
			}
			$("#container").html(prevState + "<span class = 'bot'>Chatbot: </span>" + message);
			
		}
	
		function get_username(){
			send_message("Hello, what is your name");			
		}
	
		function ai(message){
			if (username.length < 3){
				username = message;
				send_message("Nice to meet u " + username + ", How are you doing");
			}
			
			if (message.indexOf("how are you")>=0){
				send_message("Thanks, I am good");
			}
			
			if (message.indexOf("time")>=0){
				var date = new Date();
				var h = date.getHours();
				var m = date.getMinutes();
				send_message("Current Time is : "+h+":"+m);
			}
		}
		
		$(function(){
//			get_username();
			$("#textbox").keypress(function(event){
				console.log("enter pressed, checkbox is selected1");
				if(event.which == 13){
					if(("#enter").prop("checked")){
						$("#send").click();
						event.preventDefault();
					}
				}
			});
			$("#send").click(function(){
				var newMessage = $("#textbox").val();
				var userName = "<span class ='username' = >You : </span>";
				$("#textbox").val("");
				var prevState = $("#container").html();
				if(prevState.length > 3){
					prevState = prevState + "<br>";
				}
				$("#container").html(prevState  + userName + newMessage);
				$("#container").scrollTop($("#container").prop("scrollHeight"));
				
				ai(newMessage);
			});
		});
