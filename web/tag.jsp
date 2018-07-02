<!doctype html>

<head>
    <meta charset="utf-8">
    <title>Tag-it! Example</title>

    
    <link rel="stylesheet" type="text/css" href="http://yui.yahooapis.com/2.9.0/build/reset-fonts/reset-fonts.css">
    <link rel="stylesheet" type="text/css" href="http://yui.yahooapis.com/2.9.0/build/base/base-min.css">
    <link href="http://fonts.googleapis.com/css?family=Brawler" rel="stylesheet" type="text/css">
  



    <link href="res/css/jquery.tagit.css" rel="stylesheet" type="text/css">
    <link href="res/css/tagit.ui-zendesk.css" rel="stylesheet" type="text/css">
   
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js" type="text/javascript" charset="utf-8"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.9.2/jquery-ui.min.js" type="text/javascript" charset="utf-8"></script>

    
    <script src="res/js/tag-it.js" type="text/javascript" charset="utf-8"></script>

    <script>
        $(function(){
            var sampleTags = ['c++', 'java', 'php', 'coldfusion', 'javascript', 'asp', 'ruby', 'python', 'c', 'scala', 'groovy', 'haskell', 'perl', 'erlang', 'apl', 'cobol', 'go', 'lua'];

            $('#myTags').tagit();

         
            $('#singleFieldTags').tagit({
                availableTags: sampleTags,
               
                singleField: true,
                singleFieldNode: $('#mySingleField')
            });

            $('#singleFieldTags2').tagit({
                availableTags: sampleTags
            });

            $('#myULTags').tagit({
                availableTags: sampleTags, 
               
                itemName: 'item',
                fieldName: 'tags'
            });

            var eventTags = $('#eventTags');

            var addEvent = function(text) {
                $('#events_container').append(text + '<br>');
            };

            eventTags.tagit({
                availableTags: sampleTags,
                beforeTagAdded: function(evt, ui) {
                    if (!ui.duringInitialization) {
                        addEvent('beforeTagAdded: ' + eventTags.tagit('tagLabel', ui.tag));
                    }
                },
                afterTagAdded: function(evt, ui) {
                    if (!ui.duringInitialization) {
                        addEvent('afterTagAdded: ' + eventTags.tagit('tagLabel', ui.tag));
                    }
                },
                beforeTagRemoved: function(evt, ui) {
                    addEvent('beforeTagRemoved: ' + eventTags.tagit('tagLabel', ui.tag));
                },
                afterTagRemoved: function(evt, ui) {
                    addEvent('afterTagRemoved: ' + eventTags.tagit('tagLabel', ui.tag));
                },
                onTagClicked: function(evt, ui) {
                    addEvent('onTagClicked: ' + eventTags.tagit('tagLabel', ui.tag));
                },
                onTagExists: function(evt, ui) {
                    addEvent('onTagExists: ' + eventTags.tagit('tagLabel', ui.existingTag));
                }
            });

            $('#readOnlyTags').tagit({
                readOnly: true
            });

            $('#methodTags').tagit({
                availableTags: sampleTags
            });

            $('#allowSpacesTags').tagit({
                availableTags: sampleTags,
                allowSpaces: true
            });

        
            $('#removeConfirmationTags').tagit({
                availableTags: sampleTags,
                removeConfirmation: true
            });
            
        });
    </script>

</head>
<body style="background-color:white;">

<h2>enter your tags</h2>
<form action="usetag.jsp">

            <ul id="myTags" style="width:35%;"></ul>
            <input  type="submit" value="Submit">
        </form>
    
</body>
</html>


