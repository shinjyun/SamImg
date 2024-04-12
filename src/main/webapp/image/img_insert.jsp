<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>이미지 정보 입력</title>
<link rel="stylesheet" type="text/css"
	href="./css/bootstrap.min_4.5.0.css">
<link rel="stylesheet" type="text/css" href="./css/global.css">
<script src="./js/jquery-3.5.1.min.js" type="text/javascript"></script>
<script src="./js/bootstrap.min_4.5.0.js" type="text/javascript"></script>
<script src="./js/jquery.validate.min.js" type="text/javascript"></script>
<script src="./js/dept_validity.js" type="text/javascript"></script>
</head>
<body>
	<header id="main-header" class="p-2 btn-dark text-white">
		<div class="container">
			<div class="row">
				<div class="col-md-6">
					<h1>이미지 정보 입력</h1>
				</div>
			</div>
		</div>
	</header>

	<section class="py-4 mb-4 bg-light"></section>
	<section id="department">
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<div class="card">
						<div class="card-header">
							<h5>이미지 등록</h5>
						</div>
						<div class="card-body">
							<form action="./ImgInsert.im" method="post" id="sign_img">
								<fieldset>
									<div class="form-group row">
										<label for="img_number" class="ml-sm-3 col-form-label">이미지 번호</label>
										<div class="ml-sm-3">
											<input type="text" name="img_number" id="img"
												class="form-control form-control-sm">
										</div>
									</div>
									<div class="form-group row">
										<label for="img_upload" class="ml-sm-3 col-form-label">이미지 업로드</label>
										<div class="ml-sm-3">
											<input type="text" name="img_upload" id="img"
												class="form-control form-control-sm">
										</div>
									</div>
									<div class="form-group row">
										<label for="img_update" class="ml-sm-3 col-form-label">이미지 수정</label>
										<div class="ml-sm-3">
											<input type="text" name="img_update" id="img"
												class="form-control form-control-sm">
										</div>
									</div>
									<div class="form-group row">
										<label for="img_url" class="ml-sm-3 col-form-label">이미지 url</label>
										<div class="ml-sm-3">
											<input type="text" name="img_url" id="img"
												class="form-control form-control-sm">
										</div>
									</div>

									<div class="form-group">
										<button type="submit" class="btn btn-secondary">등록</button>
										<button type="reset" class="btn btn-secondary">취소</button>
									</div>
								</fieldset>
							</form>
							<div>
								<a href="./ImgSelect.im" class="btn btn-primary btn-block">이미지 목록</a>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
</body>
</html>