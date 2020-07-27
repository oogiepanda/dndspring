<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>D&D Add Character</title>
        <link href="/css/main.css" rel="stylesheet">
    </head>
    <body>
        <h2>Character: Post</h2>
        <#if characters?? >
            Id: ${characters.id}<br>
            Character Name: ${characters.charactername}<br>
            Player Name: ${characters.playername}<br>
            Strength: ${characters.strength}<br>
            Dexterity: ${characters.dexterity}<br>
            Constitution: ${characters.constitution}<br>
            Intelligence: ${characters.intelligence}<br>
            Wisdom: ${characters.wisdom}<br>
            Charisma: ${characters.charisma}<br>
            <#else>
                <form action="/addcharacter" method="post">
                    Character Name: <br>
                    <input type="text" name="charactername" maxlength="30"><br>
                    Player Name: <br>
                    <input type="text" name="playername" maxlength="30"><br>
                    Strength: <br>
                    <input type="number" name="strength" min="1"><br>
                    Dexterity: <br>
                    <input type="number" name="dexterity" min="1"><br>
                    Constitution: <br>
                    <input type="number" name="constitution" min="1"><br>
                    Intelligence: <br>
                    <input type="number" name="intelligence" min="1"><br>
                    Wisdom: <br>
                    <input type="number" name="wisdom" min="1"><br>
                    Charisma: <br>
                    <input type="number" name="charisma" min="1"><br>
                    <input type="submit" value="Add Entry">
                    <input type="reset" value="Clear Values">
                </form>
        </#if>
    <script src="/js/main.js"></script>
    </body>
</html>