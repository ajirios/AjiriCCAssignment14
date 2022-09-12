
const textarea = document.querySelector('#textarea');
var channelId = sessionStorage.getItem("channelId");

textarea.onkeypress = (event) => {
  const keyCode = event.keyCode
  if (keyCode === 13) 
  {
  var username = sessionStorage.getItem("username");
    var messageBody = textarea.value;
    textarea.value = "";
    
    var message = {
    	"sender": username,
    	"body": messageBody,
    	"channelId": channelId
    };
    
    fetch(`/channels/${channelId}/messages`, {
    	method: "POST",
    	headers: {
    		"Content-Type": "application/json"
    	},
    	body: JSON.stringify(message)
    }).then((response) => response.json())
    .then((data) => { 
    	document.querySelector("#messages").innerHTML = "";
    	
    	for (var i = 0; i < data.length; i++)
    	{
    		var messageDiv = document.createElement("div");
    		messageDiv.setAttribute("class", "message");
    		var senderBold = document.createElement("b");
    		senderBold.setAttribute("class", "sender");
    		senderBold.innerHTML = `${data[i].sender}: `;
    		var bodySpan = document.createElement("span");
    		bodySpan.setAttribute("class", "body");
    		bodySpan.innerHTML = `${data[i].body}`;
    		messageDiv.appendChild(senderBold);
    		messageDiv.appendChild(bodySpan);
    		document.querySelector("#messages").appendChild(messageDiv);
    	}
    });
  }
}



function getMessages()
{
	fetch(`/channels/${channelId}/messages`)
	.then((response) => response.json())
	.then((data) => { 
    	document.querySelector("#messages").innerHTML = "";
    	
    	for (var i = 0; i < data.length; i++)
    	{
    		var messageDiv = document.createElement("div");
    		messageDiv.setAttribute("class", "message");
    		var senderBold = document.createElement("b");
    		senderBold.setAttribute("class", "sender");
    		senderBold.innerHTML = `${data[i].sender}: `;
    		var bodySpan = document.createElement("span");
    		bodySpan.setAttribute("class", "body");
    		bodySpan.innerHTML = `${data[i].body}`;
    		messageDiv.appendChild(senderBold);
    		messageDiv.appendChild(bodySpan);
    		document.querySelector("#messages").appendChild(messageDiv);
    	}
	});


}


setInterval(getMessages, 500);
