<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div id="myBlogModal" class="modal fade" role="dialog" aria-labelledby="gridSystemModalLabel">
	  <div class="modal-dialog" role="document">
	    <div class="modal-content">
	      <div class="modal-header">
	        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
	        <h4 class="modal-title" id="gridSystemModalLabel">Write a Blog</h4>
	      </div>
		  <form action="" method="post">
		     <div class="modal-body">
				<div class="container-fluid">
				  <div class="form-group">
				  	  <textarea name="editor1" id="editor1" rows="10" cols="80">placeholder</textarea>
				  	  <script type="text/javascript">CKEDITOR.replace("editor1");</script>
				  </div>
				</div>
		      </div>
		      <div class="modal-footer">
		        <button type="submit" class="btn btn-block btn-primary">Submit</button>
		      </div>
		  </form>
	   </div><!-- /.modal-content -->
	  </div><!-- /.modal-dialog -->
    </div><!-- /.modal -->