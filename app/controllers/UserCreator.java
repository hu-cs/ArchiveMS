package controllers;

import models.UserStorage;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;

public class UserCreator extends Controller {

	public static Result createUser() {

		Form<UserStorage> userForm = Form.form(UserStorage.class)
				.bindFromRequest();
		UserStorage userToCreate = userForm.get();

		if (userToCreate.password.equals(userToCreate.retypedPassword)) {

			if (UserStorage.findByEmail(userToCreate.username) == null) {
				userToCreate.save();
				flash("success", "the user was successfully created");
				return redirect(routes.Application.renderAddUserPage());
			}

			else {
				flash("exist", "this user already exists");
				return redirect(routes.Application.renderAddUserPage());
			}

		}

		else {
			flash("do not match", "passwords do not match");
			return redirect(routes.Application.renderAddUserPage());

		}
	}

}
