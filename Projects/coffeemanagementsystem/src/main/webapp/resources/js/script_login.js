function showcontainerforgotpassword() {
    $(document).ready(function () {
        $("#aforgotpassword").click(function () {
            $(".bgcontainerlogin").toggleClass("hien");
        });
        $(".btnexit").click(function () {
            $(".bgcontainerlogin").toggleClass("hien");
        });
    });
}

function testlogin() {
    $(document).ready(function () {
        var ousername = $("#username");
        var opaswsord = $("#password");
        var txtusername = ousername.val();
        var txtpassword = opaswsord.val();
        if (0 === txtusername.length > 0 && 0 === txtpassword.length > 0) {
            callloginfromserver(txtusername, txtpassword);
        } else {
            if (0 === txtusername.length) {

            }
            if (0 === txtpassword.length) {

            }
        }
    });
}

function callloginfromserver(username, password) {
    $(document).ready(function () {      
        $.ajax({
            url: "",
            type: 'POST',
            data: 'username'+username+'&password='+password,
            success: function (result) {
                  
            }
        });

    
    });
}