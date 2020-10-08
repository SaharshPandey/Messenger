
# Messenger #

If you want a APK then create an issue, i'll send the link..
<br><b>ChatApp is a real time one to one chat application with Push Notifications made using Firebase...</b>

Add yours google-services.json
<br><b> Change Authorization:key with your key from firebase project</b>

<br>Implementation Guide 
<br>1 - Project
<br>1 - Open the Project in your android studio;
<br>2 - *IMPORTANT* Change the Package Name. (https://stackoverflow.com/questions/16804093/android-studio-rename-package)

<br>2 - Firebase Panel
<br>- Create Firebase Project (https://console.firebase.google.com/);
<br>- Import the file google-service.json into your project
<br>- Connect to firebase console authentication and database from your IDE
<br>- in firebase Storage Rules, change value of "allow read, write:" from "if request.auth != null" to "if true;"
<br>- For sending notification, paste your Firebase project key into your project APIService.java
<br>- When you change database settings, you likely will need to uninstall and reinstall apps to avoid app crashes due to app caches.

Check out the design...
# Welcome, Login, Signup, Forgot Password
<img src="https://user-images.githubusercontent.com/26492582/67112482-f7031780-f1f4-11e9-8264-4245187fbc8d.png" width="200" height="400"/>   <img src="https://user-images.githubusercontent.com/26492582/67112477-f7031780-f1f4-11e9-843e-43ef987ea1df.png" width="200" height="400"/>    <img src="https://user-images.githubusercontent.com/26492582/67112478-f7031780-f1f4-11e9-8beb-1daa94300ccb.png" width="200" height="400"/>    <img src="https://user-images.githubusercontent.com/26492582/67112474-f5d1ea80-f1f4-11e9-83ab-f89e4d55967e.png" width="200" height="400"/>  

# Chats, Users, Profile Screens
<img src="https://user-images.githubusercontent.com/26492582/67112193-45fc7d00-f1f4-11e9-8350-2c42c320f73b.png" width="250" height="500"/>    <img src="https://user-images.githubusercontent.com/26492582/67112192-45fc7d00-f1f4-11e9-9dc6-f7a92db849da.png" width="250" height="500"/>    <img src="https://user-images.githubusercontent.com/26492582/67112191-45fc7d00-f1f4-11e9-83a7-06da1a9b2457.png" width="250" height="500"/> 
 
# Chat Screen, Friend Profile, Logout Menu
<img src="https://user-images.githubusercontent.com/26492582/67112187-4432b980-f1f4-11e9-94da-910e9e749702.png" width="250" height="500"/>    <img src="https://user-images.githubusercontent.com/26492582/67112181-439a2300-f1f4-11e9-9125-6fa64426e583.png" width="250" height="500"/>    <img src="https://user-images.githubusercontent.com/26492582/67112180-43018c80-f1f4-11e9-82c2-7c299e6d9cc1.png" width="250" height="500"/>




