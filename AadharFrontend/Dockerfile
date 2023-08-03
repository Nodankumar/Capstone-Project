# Use a specific version of node (adjust the version if needed)
FROM --platform=$BUILDPLATFORM node:16 as builder

# Set the working directory inside the container
WORKDIR /project

# Install Angular CLI globally (not @angular, which is a library)
RUN npm install -g @angular/cli@^12

# Copy package.json and package-lock.json
COPY package.json package-lock.json ./

# Install project dependencies
RUN npm ci

# Copy the entire project directory
COPY . .
CMD ["ng", "serve", "--host", "0.0.0.0"]