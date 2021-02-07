import React from "react";
import { Link } from "react-router-dom";

import {
  Button,
  Card,
  CardBody,
  Form,
  FormGroup,
  Label,
  Input
} from "reactstrap";

const SignUp = () => (
  <React.Fragment>
    <div className="text-center mt-4">
      <h1 className="h2">Get started</h1>
      <p className="lead">
      Create account to experience the course at <b>VTI Academy</b>
      </p>
    </div>

    <Card>
      <CardBody>
        <div className="m-sm-4">
          <Form>

            <FormGroup>
              <Label>First Name</Label>
              <Input
                bsSize="lg"
                type="text"
                name="firstName"
                placeholder="Enter your first name"
              />
            </FormGroup>

            <FormGroup>
              <Label>Last Name</Label>
              <Input
                bsSize="lg"
                type="text"
                name="lastName"
                placeholder="Enter your last name"
              />
            </FormGroup>

            <FormGroup>
              <Label>Username</Label>
              <Input
                bsSize="lg"
                type="text"
                name="username"
                placeholder="Enter your username"
              />
            </FormGroup>

            <FormGroup>
              <Label>Email</Label>
              <Input
                bsSize="lg"
                type="email"
                name="email"
                placeholder="Enter your email"
              />
            </FormGroup>

            <FormGroup>
              <Label>Password</Label>
              <Input
                bsSize="lg"
                type="password"
                name="password"
                placeholder="Enter password"
              />
            </FormGroup>

            <FormGroup>
              <Label>Confirm Password</Label>
              <Input
                bsSize="lg"
                type="password"
                name="confirmPassword"
                placeholder="Enter confirm password"
              />
            </FormGroup>

            <div className="text-center mt-3">
              <Link to="/dashboard/default">
                <Button color="primary" size="lg">
                  Sign up
                </Button>
              </Link>
            </div>

          </Form>
        </div>
      </CardBody>
    </Card>
  </React.Fragment>
);

export default SignUp;
