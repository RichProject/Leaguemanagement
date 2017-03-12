function shownavsearch() {
    $(document).ready(function () {
        $(".btnsearchnav").click(function () {
            $(".navsearch").toggleClass("hien");
            if ($(".navsearch").hasClass("an")) {
                $(this).html('<i class="fa fa-caret-down"></i>');
                $(".navsearch").removeClass("an");
            } else {
                $(this).html('<i class="fa fa-caret-right"></i>');
                $(".navsearch").addClass("an");
            }
        });
    });
}
var method = "<i class='delaccount fa fa-trash-o'></i> <i class='detailaccount fa fa-eye'></i> <i class='editaccount fa fa-pencil'></i>";
var dataSet = [
    ["Tiger Nixon", "System Architect", "Edinburgh", "5421", "2011/04/25", "$320,800", method]


];

function filltableaccount(dataSet) {
    $(document).ready(function () {
        $('#tableaccount').DataTable({
            data: dataSet,
            searching: false,
            ordering: false,
            lengthChange: false,
            columns: [
                {title: "Mã KH"},
                {title: "Số CMND"},
                {title: "Tên Khách Hàng"},
                {title: "Giới Tính"},
                {title: "Ngày Sinh"},
                {title: "Địa Chỉ"},
                {title: "Hành Động"}
            ]
        });
        $(".delaccount").bind('click', function () {
            //su kien xoa account 
            var id = $(this).parent().parent().children(0).first().text();
            alert(id);

        });
        $(".detailaccount").bind('click', function () {
            //su kien xem chi tiet account
            var id = $(this).parent().parent().children(0).first().text();
            alert(id);

        });
        $(".editaccount").bind('click', function () {
            //su kien sua account
            var id = $(this).parent().parent().children(0).first().text();
            alert(id);
        });
    });
}

filltableaccount(dataSet);





