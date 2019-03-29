# csia
This is my Internal Assesment for my IB HL Computer Science class

# Installation instructions
+ Clone or download the addressbook.jar file 
+ In the command line:
  + cd path/to/addressbook.jar
  + java -jar addressbook.jar
  + (This will leave the parent terminal hanging around, so it is recommended to only do this to diagnose a problem)
+ In a GUI:
  + Navigate to path/to/addressbook.jar
  + Click on it. If that does not work, right/control click on it and select any likely suspects from the menu

# Manual
The program first opens on the Search People tab, where you will be greeted by the following;
+ An initially empty list that will contain people's names and categories.
+ A text field into which you will write names of people to search for.
+ A search button that you will press to search your address book by name.
+ A combo box from which you will select a category to sort your address book by.
+ A find button which you will press to sort your address book by an entry you select from the combo box.
+ An delete person button which you will use to delete a person from you address book afte selecting them from the list.
+ An edit person button that'll open up the information of the selected person in the New Person tab (as of right now you need to manually switch to the New Person tab).
+ A field of labels to the right of the list that'll display the personal information of the people you click on.
+ A refresh button that refreshes everything in the Search People tab.

Switching to the New Person tab you'll see a bunch of text fields and combination boxes with a few buttons. When adding a new person or editing an existing one, be sure to fill all of the fields. Next to the category combo box you'll see an add category button. Just ignore it, I've been having some problems with its intended functions. Press the enter button to save your edit or add the new entry to your address book. 

You'll also see an Import/Export Person tab; just ignore it, I've not ben successfl in adding functionality to it.

## WARNING
+ **This program is a high school project. In its current form I would recommend against using it for anything important.**
+ **I have not added file writing/reading capabilities to this program yet. When you close it, all your data will be lost.**

# TODO/Extensibility list
+ Add file reading/writing capability
  + Write to a file when modifictions are made, read from it on startup
+ Allow the user to define and edit categories
+ Allow a Person to be placed in multiple categories
+ Give functionality to the import/export tab
+ Allow the user to leave certain fields blank in the New Person tab
+ Replace email and phone arrays in Person template class with an ArrayList of contact information
  + View contact information with a table
+ Investigate the ability to use Selenium Webdriver to fetch contact information from webmail services
  + Add method using to Rickroll the user if they input a person named Rick
+ Improve modularity and elegance of the code by making the main class independent of the GUI class
+ Improve layout and look/feel
+ Switch to the edit person tab when the edit person button is pressed

# Version List

### Version 1.0 (Planned) -- First stable release -- unknown

### Version 0.5 (Planned) -- Meets all functionality goals outlined in the IA -- unknown 

### Version 0.0 (Current Version) -- Minimum viable product for Internal Assesment -- 03-29-2019
