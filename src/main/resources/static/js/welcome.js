/**
 * 
 */
 var username = null;
 
 if (sessionStorage.getItem("username") == null)
 {
	username = window.prompt("Please enter your username.");
 	sessionStorage.setItem("username", username);
 }
 
 function setChannelId()
 {
 	sessionStorage.setItem("channelId", 1);
 }
 
 