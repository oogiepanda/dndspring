<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>D&D Get Character</title>
        <link href="/css/main.css" rel="stylesheet">
    </head>
    <body>
        <h1>Character: Get</h1>
        <#list characters as characterentities>
            Id: ${characterentities.getId()}<br>
            Character Name: ${characterentities.getCharactername()}<br>
            Player Name: ${characterentities.getPlayername()}<br>
            Strength: ${characterentities.getStrength()}<br>
            Dexterity: ${characterentities.getDexterity()}<br>
            Constitution: ${characterentities.getConstitution()}<br>
            Intelligence: ${characterentities.getIntelligence()}<br>
            Wisdom: ${characterentities.getWisdom()}<br>
            Charisma: ${characterentities.getCharisma()}<br>
        </#list>
        <script src="/js/main.js"></script>
    </body>
</html>