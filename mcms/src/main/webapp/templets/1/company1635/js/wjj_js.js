// JavaScript Document
$(document).ready(function() {
    $('.ulNav').hover(function(){
		var $this = $(this);
		$('.subDiv').stop(true,true).slideToggle("fast");
		
		});
		
		
		/*$(".aSty1").click(function(){
			$(this).toggleClass("aStyle");
			$(".ra").toggleClass("raStyle");
			})*/
			
			
			$(".workUl li").hover(function () {
        $(this).siblings().find(".workBg").stop(true, true).fadeIn(500);
        
    },function () {
        $(this).siblings().find(".workBg").stop(true, true).fadeOut(500);
       
	})
	 jQuery("#teams .team li").each(function(i){ jQuery("#teams .team li").slice(i*4,i*4+4).wrapAll("<ul class='clearfix'></ul>");});
jQuery("#teams").slide({titCell:".hd004 ul",mainCell:".team .teamUl",autoPage:true,effect:"leftLoop",autoPlay:true});
	jQuery("#offer .offerC li").each(function(i){ jQuery("#offer .offerC li").slice(i*4,i*4+4).wrapAll("<ul class='clearfix'></ul>");});
	
jQuery("#offer").slide({titCell:".hd002 ul",mainCell:".offerC .offerUl",autoPage:true,effect:"leftLoop",autoPlay:false});
	jQuery("#works").slide( {titCell:".hd003 ul li",mainCell:".work", autoPlay:false });
	jQuery(".slideBox001").slide({titCell:".hd ul li",mainCell:".bd ul",autoPlay:true});
	
jQuery("#office").slide({mainCell:".officeC ul",delayTime:1000,autoPlay:true})


	$('.strategyUl > li').click(function(){
		var $this = $(this);
		/*$this.stop().animate({'height':'822px'},500);*/
		$('.name01',$this).stop(true,true).fadeToggle();
		$('.strategyImg',$this).stop(true,true).slideToggle(500);
		
	}/*,function(){
		var $this = $(this);
		$this.stop().animate({'height':'60px'},1000);
		$('.name01',$this).stop(true,true).fadeIn();
		
		$('.strategyImg',$this).stop(true,true).slideUp(700);
	}*/);
	
	/*滚动*/
	/*$(".prev1").click(function(){
		$("#prevNext1").animate({bottom:"-20px"},"slow")
		$("html,body").animate({scrollTop: $('#header').offset().top}, 500);
		})
	$(".next1").click(function(){
		$("#prevNext1").animate({bottom:"-40px"},"slow")
		$("html,body").animate({scrollTop: $('#offer').offset().top}, 500);
		})
		
		
		
  	$(".prev2").click(function(){
		$("#prevNext2").animate({bottom:"-20px"},"slow")
		$("html,body").animate({scrollTop: $('#offer').offset().top}, 500);
		})
	$(".next2").click(function(){
		$("#prevNext2").animate({bottom:"-40px"},"slow")
		$("html,body").animate({scrollTop: $('#works').offset().top}, 500);
		})
		
		
		
		$(".prev3").click(function(){
		$("#prevNext3").animate({bottom:"-20px"},"slow")
		$("html,body").animate({scrollTop: $('#works').offset().top}, 500);
		})
	$(".next3").click(function(){
		$("#prevNext3").animate({bottom:"-40px"},"slow")
		$("html,body").animate({scrollTop: $('#teams').offset().top}, 500);
		})
		
		
  	$(".prev4").click(function(){
		$("#prevNext4").animate({bottom:"-20px"},"slow")
		$("html,body").animate({scrollTop: $('#teams').offset().top}, 500);
		})
		$(".next4").click(function(){
		$("#prevNext4").animate({bottom:"-40px"},"slow")
		$("html,body").animate({scrollTop: $('#news').offset().top}, 500);
		})
		$(".prev5").click(function(){
		$("#prevNext5").animate({bottom:"0px"},"slow")
		$("html,body").animate({scrollTop: $('#news').offset().top}, 500);
		})
  	$(".next5").click(function(){
		$("#prevNext5").animate({bottom:"-40px"},"slow")
		$("html,body").animate({scrollTop: $('#contact').offset().top}, 500);
		})*/
		
		
	   /*右侧悬浮窗效果*/
  $(document).ready(function(){
	  $(".wxBtn").toggle(function(){
		$(".qqWeb02").addClass("rightQqCl");
		},function(){
			$(".qqWeb02").removeClass("rightQqCl");})
			$(".qqBtn").toggle(function(){
		$(".qqWeb02").addClass("rightQqCl");
		},function(){
			$(".qqWeb02").removeClass("rightQqCl");})
		$(".phoneBtn").toggle(function(){
		$(".qqWeb02").addClass("rightQqCl");
		},function(){
			$(".qqWeb02").removeClass("rightQqCl");})
			
			
	  $(".aSty1").toggle(function(){
		$(".qqWeb02").addClass("rightQqCl");
		},function(){
			$(".qqWeb02").removeClass("rightQqCl");})
			
		$(".ra > a").hover(function(){
			$(this).stop(true,true).fadeTo("slow", 0.66);
			
			},function(){
				$(this).stop(true,true).fadeTo("slow", 1);
				})
				$(".wxBtn").hover(function(){
					$(".qqImg").css({display:"none"});
					$(".commonDiv").addClass("wxCode");
					
					},function(){
						
						$(".commonDiv").removeClass("wxCode");
						$(".qqImg").css({display:"block"});
						})
						
						$(".phoneBtn").hover(function(){
							$(".qqImg").css({display:"none"});
						$(".commonDiv").addClass("phoneImg");
					},function(){
						$(".commonDiv").removeClass("phoneImg");
						$(".qqImg").css({display:"block"});
						})
	/*$(".aSty1").toggle(function(){
		$(".qqWeb02").addClass("rightQqCl");
		},function(){
			$(".qqWeb02").removeClass("rightQqCl");})
	
					
		$(".wxBtn").hover(function(){
			$(this).stop(true,true).fadeTo("slow", 0.66);
			},function(){
				$(this).stop(true,true).fadeTo("slow", 1);
				})
			$(".qqBtn").hover(function(){
				$(".commonDiv").removeClass("wxCode");
				$(".commonDiv").addClass("qqImg");
			$(this).stop(true,true).fadeTo("slow", 0.66);
			},function(){
				$(this).stop(true,true).fadeTo("slow", 1);
				$(".commonDiv").removeClass("qqImg");
				$(".commonDiv").addClass("wxCode");
				})
			$(".phoneBtn").hover(function(){
				$(".commonDiv").removeClass("wxCode");
				$(".commonDiv").addClass("phoneImg");
			$(this).stop(true,true).fadeTo("slow", 0.66);
			},function(){
				$(".commonDiv").removeClass("phoneImg");
				$(".commonDiv").addClass("wxCode");
				$(this).stop(true,true).fadeTo("slow", 1);
				})*/
		})
		
		
		//图库弹出层
	$(".mskeLayBg").height($(document).height());
	$(".mskeClaose").click(function(){
		$(".mskeLayBg,.mskelayBox").hide()
	});
	$(".mskeLayBg").click(function(){
		$(".mskeLayBg,.mskelayBox").hide();
	});
	$(".pic").click(function(){
		$(".mske_html").html($(this).find(".offhidden").html());
		$(".mskeLayBg").show();
		$(".mskelayBox").fadeIn(300)
	});
  
});
